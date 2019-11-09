import { Timer } from "./timer";

const timer = new Timer("seconds", 1000);

export class Main {

	public static update(): void {

		timer.run();

		if(timer.nextTick()) {
			console.log("1 second elapsed");
		}
		
		const self = this;
		window.requestAnimationFrame(() => self.update());
	}
}

window.onload = () => {
	timer.enable();
	Main.update();
};