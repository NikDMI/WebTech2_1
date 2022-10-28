package by.bsuir.lab1.basket;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import by.bsuir.lab1.ball.*;
import by.bsuir.lab1.ball.Ball.Color;

public class Basket {
	
	public Basket(int ballsCount) {
		if(ballsCount < 0) {
			throw new IllegalArgumentException("Negative balls count in the basket");
		}
		balls = new ArrayList<>();
		for(int i = 0; i < ballsCount; ++i) {
			addRandomBall();
		}
	}
	
	
	public void addRandomBall() {
		Ball.Color color = Color.getColor(Math.abs(random.nextInt() % (Color.getMaxValue() + 1)));
		balls.add(new Ball(Math.abs(random.nextInt() % 100), color));
	}
	
	
	public int getTotalBallsWeight() {
		int totalWeight = 0;
		for(Ball ball: balls) {
			totalWeight += ball.getWeight();
		}
		return totalWeight;
	}
	
	
	public int getCountOfSemicolorBalls(Ball.Color color) {
		int totalBalls = 0;
		for(Ball ball: balls) {
			if(color == ball.getColor()) {
				totalBalls++;
			}
		}
		return totalBalls;
	}
	
	
	@Override
	public String toString() {
		String description = "Basket: \n";
		for(Ball ball: balls) {
			description += ball.toString() + "\n";
		}
		return description;
	}
	
	private List<Ball> balls;
	private static Random random = new Random();
}
