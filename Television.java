/** 
*The purpose of this class is to model a television
* Ruth Ferez and April/27/2023
*/
public class Television {
	

    /** TV Manufacturer */
    private final String manufacturer;

    /** Size of the Television Screen */
    private final int screenSize;

    private boolean powerOn;    // The powerState of the TV.
    private int channel;        // The current channel
    private int volume;         // The current volume

    /**
     * A Constructor that is designed to express the
     * brand and size of the television.
     *
     * @param brand The brand of the TV
     * @param size  The size of the TV
     */
    public Television(String brand, int size) {
        // Initialize all of the global variables
        this.manufacturer = brand;
        this.screenSize = size;
        this.channel = 0;
        this.volume = 20;
        this.powerOn = false;
    }

    /**
     * Method designed to change the channel of the Television
     *
     * @param station The channel it goes to
     */
    public void setChannel(int station) {
        this.channel = station;
    }

    /** Powers the Television on and off */
    public void power() {
        this.powerOn = !this.powerOn;
    }

    /** Increases the volume of the TeleVision */
    public void increaseVolume() {
        this.volume++;
    }

    /** Decreases the volume of the Television */
    public void decreaseVolume() {
        this.volume--;
    }

    /** Get the current channel
     *
     * @return the currently set channel
     */
    public int getChannel() {
        return this.channel;
    }

    /** Get the current volume
     *
     * @return the currently set volume
     */
    public int getVolume() {
        return this.volume;
    }

    /** The the manufacturer of the Television
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /** Return the size of the TV
     *
     * @return the TV size
     */
    public int getScreenSize() {
        return this.screenSize;
    }
}