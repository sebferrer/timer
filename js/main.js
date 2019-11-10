const timer = new Timer("seconds", 1000);

class Main {

    static update() {

		timer.run();
		
        if (timer.nextTick()) {
            console.log(timer.tick + " seconds elapsed");
		}
		
        const self = this;
        window.requestAnimationFrame(() => self.update());
	}
	
}

window.onload = () => {
    timer.enable();
	Main.update();
};