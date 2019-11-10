import java.util.Date;

public class Timer {
    private String id;
    private int interval;
    private int elapsed;
    private int tick;
    private boolean enabled;
    private long start;

    public Timer(String id, int interval) {
        this.id = id;
        this.interval = interval;
        this.elapsed = 0;
        this.tick = 0;
        this.enabled = false;
        this.start = new Date().getTime();
    }

    public void enable() {
        if (!this.enabled) {
            this.enabled = true;
        }
    }

    public void disable() {
        if (this.enabled) {
            this.enabled = false;
        }
    }

    // When started, add 1 tick each X interval
    // To use to an update function
    public void run() {
        if (this.enabled) {
            this.elapsed = (int) (new Date().getTime() - this.start);
            if (this.elapsed > this.interval) {
                this.tick++;
                this.start = new Date().getTime();
            }
        }
    }

    // To use to an update function
    public boolean nextTick() {
        return this.elapsed > this.interval;
    }

    public int getTick() {
        return this.tick;
    }

    public void reset() {
        this.elapsed = 0;
        this.tick = 0;
        this.enabled = false;
    }

    public void restart() {
        this.elapsed = 0;
        this.tick = 0;
        this.enabled = true;
    }
}