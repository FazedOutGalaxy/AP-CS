package com.alex.apcs.projects.ifelse.runners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.alex.apcs.abstracts.ApcsProject;
import com.alex.apcs.projects.ifelse.Social;

public class SocialRunner extends ApcsProject {

	private static final SocialRunner instance = new SocialRunner();
	private static final List<String> params = new ArrayList<String>();
	
	@Override
	public void execute() {
		Iterator<String> iter = params.iterator();
		Social social = new Social("456-56-234");
		social.execute();
		printLine(social.toString());
		while (iter.hasNext()) {
			social.setSocialNumber(iter.next());
			social.execute();
			printLine(social);
		}
	}

	public static void main(String[] args) {
		if (params.isEmpty())
			init();
		instance.execute();
	}
	
	private static synchronized void init() {
		params.clear();
		params.add("1-1-1");
		params.add("102-2-12");
		params.add("0-0-0");
	}

}
