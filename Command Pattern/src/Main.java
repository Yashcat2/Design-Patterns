
public class Main {
    public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();

        // Create command objects
        command turnOnTVCommand = new TurnOnCommand(tv);
        command turnOffTVCommand = new TurnOffCommand(tv);
        command adjustVolumeStereoCommand = new AdjustVolumeCommand(stereo);
        command changeChannelTVCommand = new ChangeChannelCommand(tv);

        // Create remote control
        RemoteControl remote = new RemoteControl();

        // Set and execute commands
        remote.setCommand(turnOnTVCommand);
        remote.pressButton(); // Outputs: TV is now on

        remote.setCommand(adjustVolumeStereoCommand);
        remote.pressButton(); // Outputs: Volume adjusted

        remote.setCommand(changeChannelTVCommand);
        remote.pressButton(); // Outputs: Channel changed

        remote.setCommand(turnOffTVCommand);
        remote.pressButton(); // Outputs: TV is now off
    }
}


