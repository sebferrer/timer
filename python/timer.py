import time


class Timer:

    def __init__(self,  new_id, interval):
        self.id = new_id
        self.interval = interval
        self.elapsed = 0
        self.tick = 0
        self.enabled = False
        self.start = int(round(time.time() * 1000))

    def enable(self):
        if not self.enabled:
            self.enabled = True

    def disable(self):
        if self.enabled:
            self.enabled = False

    # When started, add 1 tick each X interval
    # To use to an update function
    def run(self):
        if self.enabled:
            self.elapsed = int(round(time.time() * 1000)) - self.start
            if self.elapsed > self.interval:
                self.tick += 1
                self.start = int(round(time.time() * 1000))

    # To use to an update function
    def next_tick(self):
        return self.elapsed > self.interval

    def get_tick(self):
        return self.tick

    def reset(self):
        self.elapsed = 0
        self.tick = 0
        self.enabled = False

    def restart(self):
        self.elapsed = 0
        self.tick = 0
        self.enabled = True
