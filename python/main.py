from timer import Timer

if __name__ == "__main__":

    timer = Timer("seconds", 1000)

    timer.enable()

    while timer.get_tick() < 10:

        timer.run()

        if timer.next_tick():
            print(str(timer.get_tick()) + " seconds elapsed")
