package de.augenblau.GitHubTestProject;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GitHubTestProject extends JFrame {

	public static void main(String[] args) {
		new GitHubTestProject();
	}

	public GitHubTestProject() {
		super();
		setSize(new Dimension(400,400));
		setLocation(50, 50);
		setTitle("GitHubTestProject");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
