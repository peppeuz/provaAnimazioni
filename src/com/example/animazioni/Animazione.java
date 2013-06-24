package com.example.animazioni;


import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class Animazione {
	public Animation inFromRightAnimation(int ms) {
		Animation inFromRight = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		inFromRight.setDuration(ms);
		inFromRight.setInterpolator(new AccelerateInterpolator());
		return inFromRight;
	}

	public Animation outToLeftAnimation(int ms) {
		Animation outtoLeft = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		outtoLeft.setDuration(ms);
		outtoLeft.setInterpolator(new AccelerateInterpolator());
		return outtoLeft;
	}

	public Animation inFromLeftAnimation(int ms) {
		Animation inFromLeft = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		inFromLeft.setDuration(ms);
		inFromLeft.setInterpolator(new AccelerateInterpolator());
		return inFromLeft;
	}

	public Animation outToRightAnimation(int ms) {
		Animation outtoRight = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		outtoRight.setDuration(ms);
		outtoRight.setInterpolator(new AccelerateInterpolator());
		return outtoRight;
	}

	public Animation inFromTopAnimation(int ms) {
		Animation inFromTop = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		inFromTop.setDuration(ms);
		inFromTop.setInterpolator(new AccelerateInterpolator());
		return inFromTop;
	}

	public Animation inFromBottomAnimation(int ms) {
		Animation inFromBottom = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		inFromBottom.setDuration(ms);
		inFromBottom.setInterpolator(new AccelerateInterpolator());
		return inFromBottom;
	}

	public Animation outToTopAnimation(int ms) {
		Animation outtoRight = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, +1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		outtoRight.setDuration(ms);
		outtoRight.setInterpolator(new AccelerateInterpolator());
		return outtoRight;
	}

	public Animation outToBottomAnimation(int ms) {
		Animation outtoRight = new TranslateAnimation(
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f,
				Animation.RELATIVE_TO_PARENT, -1.0f,
				Animation.RELATIVE_TO_PARENT, 0.0f);
		outtoRight.setDuration(ms);
		outtoRight.setInterpolator(new AccelerateInterpolator());
		return outtoRight;
	}
}
