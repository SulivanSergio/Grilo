package Scripts;

import java.util.Random;

public class Main {
	
	static final int C = 8;
	static final int T = 8;
	
	float position = 0;
	float speed = 10.0f;
	
	int contadorTime;
	
	
	static int time = 1;
	
	static int grilos[] = new int[C];
	
	static ThreadGrilos thread[] = new ThreadGrilos[T];
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i =0; i< C; i++)
		{
			
			grilos[i] = i;
			
		}
		
		for(int i = 0; i< T;i++)
		{
			thread[i] = new ThreadGrilos(grilos,random.nextInt(5),random.nextInt(10),30f,i,time);
			thread[i].start();
			if(i == T / (T/4))
			{
				time += 1;
			}
		}
		
		//Main mn = new Main();
		//mn.Start();
		
	}
	
	
	public void Input()
	{
		
	}
	
	public void Update(float deltaTime)
	{
		
		
		
	}
	public void FixedUpdate(float fixedDeltaTime)
	{
		
		
	}
	
	public void Render()
	{
		
		
		
	}
	
	
	public void Start()
	{
		float deltaTime = 0;
		
		
		while(true)
		{
			long start = System.currentTimeMillis();
			
			
			
			Input();
			Update(deltaTime);
			
			
			
			Render();
			
			long end = System.currentTimeMillis();
			deltaTime = (float) (end - start)/ 1000.0f;
		
			
			
			
		}
		
		
	}
	
	

}