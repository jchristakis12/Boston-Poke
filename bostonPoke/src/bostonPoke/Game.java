package bostonPoke;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application implements Display {
	
	
	public static final int Width = 640, Height = Width / 12 * 9;
	public Thread thread;
	private boolean running = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game();
	}
	
	public Game() {
		new Window(Width, Height, "Boston Poke", this);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
	
	/***
	
	public synchronized void start() {
		thread = new Thread((Runnable) this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		}catch(Exception bug) {
			bug.printStackTrace();
		}
	}
	
	
	
	
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1) {
				tick();
				delta--;
			}
			if(running) {
				render();
				frames++;
				
				if(System.currentTimeMillis() - timer > 1000) {
					timer += 1000;
					System.out.println("FPS: " + frames);
					frames = 0;
				}
			}
			stop();
				}
			}
	
	
	private void tick() {
		
	}
		
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Width, Height);
		g.dispose();
		bs.show();
	}
		
}
	
	
	


