package ca.ualberta.cs.lonelytwitter.data;

import java.util.Date;


import android.util.Log;


public class ImportantTweet extends LonelyTweet
{

	public ImportantTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}
	
	@Override
	public boolean isValid()
	{
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	public String getTweetBody()
	{
		return "IMPORTANT " + tweetBody;
	}

	@Override
	public String toString()
	{
		String impTweet = "IMPORTANT " + getTweetDate() + " | " + getTweetBody();
		Log.i("MY_TAG", impTweet);
		return impTweet;
	}

}
