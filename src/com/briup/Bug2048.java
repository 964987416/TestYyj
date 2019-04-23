package com.briup;//


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * 
 * 使用GUI实现2048小游戏编程
 * 
 * @author moose
 *
 */

public class Bug2048 extends JFrame
{
	private static final long serialVersionUID = 1L;	
	public final int med = 0;
	JButton[][] load;
	Font font = new Font("", Font.BOLD, 15);
	Font f1 = new Font("宋体", Font.PLAIN, 17);
	int count = 16;// 剩余格子数

	public Bug2048(){
		setBounds(500, 100, 500, 500);
		setSize(500, 500);
		setTitle("2048");
		setLayout(new GridLayout(4, 4, 1, 1));
		load = new JButton[4][4];
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < load[i].length; j++)
			{
				load[i][j] = new JButton();
				load[i][j].setBackground(Color.white);
				load[i][j].addKeyListener(new MyListener());	
				add(load[i][j]);
			}
		}
		creatNum();
		creatNum();
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
//main
	public static void main(String[] args)
	{
		new Bug2048();
	}
//随机数
	public synchronized void creatNum()
	{
		if (count > 0)
		{
			while (true)
			{
				int i = new Random().nextInt(4);
				int j = new Random().nextInt(4);
				if (load[i][j].getText() == "")
				{
					int num = new Random().nextInt(5);
					if (num == 2 || num == 4)
					{
						load[i][j].setText(num + "");
						load[i][j].setFont(f1);
						setColor(i, j);
						count--;
						break;
					}
					continue;
				}
			}
		}
	}
	public void setColor(int i, int j)
	{
		if (load[i][j].getText() == "")
		{
			load[i][j].setBackground(Color.white);
		} else
		{
			int key = Integer.parseInt(load[i][j].getText());
			switch (key)
			{
			case 2:
			case 32:
			case 512:
				load[i][j].setBackground(Color.GRAY);
				break;
			case 4:
			case 64:
			case 1024:
				load[i][j].setBackground(Color.orange);
				break;
			case 8:
			case 128:
				load[i][j].setBackground(Color.pink);
				break;
			case 16:
			case 256:
				load[i][j].setBackground(Color.yellow);
				break;
			case 2048:
				load[i][j].setBackground(Color.red);
                
				break;
			default:

				break;
			}
		}
	}
	class MyListener extends KeyAdapter
	{

		public void keyPressed(KeyEvent e)
		{
			int key = e.getKeyCode();
			switch (key)
			{
			case KeyEvent.VK_DOWN:// 下
				changeNum(1, 0);

				break;
			case KeyEvent.VK_UP:// 上
				changeNum2(1, 0);

				break;
			case KeyEvent.VK_LEFT:// 左
				changeNum2(0, 1);

				break;
			case KeyEvent.VK_RIGHT:// 右
				changeNum(0, 1);

				break;
			default:
				break;
			}

		}

		public void changeNum(int x, int y)// 下 右
		{
			int num = 0;
			for (int i = load.length - x - 1; i >= 0; i--)
			{
				for (int j = load.length - y - 1; j >= 0; j--)
				{
					if (load[i][j].getText() != "")
					{
						if (load[i + x][j + y].getText().equals(
								load[i][j].getText()))
						{
							int sum = Integer.parseInt(load[i][j].getText()) * 2;
							load[i + x][j + y].setText(sum + "");
							load[i][j].setText("");
							load[i + x][j + y].setFont(font);
							setColor(i, j);
							setColor(i + x, j + y);
							count++;
							num++;
						} else if (load[i + x][j + y].getText().equals(""))
						{
							load[i + x][j + y].setText(load[i][j].getText());
							load[i][j].setText("");
							setColor(i + x, j + y);
							setColor(i, j);
							num++;
						}
						if (load[i + x][j + y].getText().equals(
								load[i][j].getText()))
						{
							int sum = Integer.parseInt(load[i][j].getText()) * 2;
							load[i + x][j + y].setText(sum + "");
							load[i][j].setText("");
							load[i + x][j + y].setFont(font);
							setColor(i, j);
							setColor(i + x, j + y);
							count++;
							num++;
						}
					}
				}
			}
			if (num != 0)
				creatNum();

		}

		public void changeNum2(int x, int y)// 上 左
		{
			int num = 0;
			for (int i = x; i <= load.length - 1; i++)
			{
				for (int j = y; j <= load.length - 1; j++)
				{
					if (load[i][j].getText() != "")
					{
						if (load[i - x][j - y].getText().equals(
								load[i][j].getText()))
						{
							int sum = Integer.parseInt(load[i][j].getText()) * 2;
							load[i - x][j - y].setText(sum + "");
							load[i - x][j - y].setFont(font);
							load[i][j].setText("");
							setColor(i, j);
							setColor(i - x, j - y);
							count++;
							num++;
							continue;
						} else if (load[i - x][j - y].getText().equals(""))
						{
							load[i - x][j - y].setText(load[i][j].getText());
							load[i][j].setText("");
							setColor(i - x, j - y);
							setColor(i, j);
							if (load[i - x][j - y].getText().equals(
									load[i][j].getText()))
							{
								int sum = Integer.parseInt(load[i][j]
										.getText()) * 2;
								load[i - x][j - y].setText(sum + "");
								load[i - x][j - y].setFont(font);
								setColor(i, j);
								setColor(i - x, j - y);
								count++;
							}
							num++;
							// continue;
						}
					}
				}
			}
			if (num != 0)
				creatNum();
		}
	}
}
