package Scripts;
import java.util.Random;


public class ThreadGrilos extends Thread{

	int grilos[];
	
	float position, seg = 0, LinhaChegada, tempo, tamanhoPulo;
	
	int i, pulo = 0;
	int time;
	Random random = new Random(); 
	
	public ThreadGrilos(int grilos[],float tempo,float tamanhoPulo,float LinhaChegada, int i, int time)
	{
		
		this.grilos = grilos;
		this.tamanhoPulo = tamanhoPulo;
		this.tempo = tempo;
		this.LinhaChegada = LinhaChegada;
		this.i = i;
		this.time = time;
	}
	

			
	private void Start()
	{
		
		float deltaTime = 0;
		
		while(true)
		{
			
			long start = System.currentTimeMillis();
			
			Update(deltaTime);
			Render();
			
			long end = System.currentTimeMillis();
			deltaTime = (float) (end - start)/ 1000.0f;
			
			if (position > LinhaChegada)
			{
				System.out.println("Grilo_0" + grilos[i] + "      Metros que ele percorreu: " + position);
				System.out.println("Grilo_0" + grilos[i] + "  Ganhou    Pulos: " + pulo + "Time: " + time);
				return;
			}
			
		}
		
		
	}
	
	private void Update(float deltaTime)
	{
		
		if(seg > tempo)
		{
			position = position + tamanhoPulo;
			tempo = random.nextInt(5);
			seg = 0;
			pulo += 1;
		}
		seg += tamanhoPulo * deltaTime;
	
	}
	
	public void Render()
	{
		
		
		
	}



	@Override
	public void run() {
		Start();
		
		
	}

}