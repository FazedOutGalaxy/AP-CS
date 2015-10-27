package com.alex.apcs.managers;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCensor {
	
	
	public static String censor(String message) {
		String next = message;
		
		ArrayList<String> censoredWordsRegex = new ArrayList<String>();
		
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[aA4@248]+[\\W[_]]*[sS5$]+[\\W[_]]*[sS5$]+[hH]+[\\W[_]]*[oO0]+[\\W[_]]*([lL1!]*[\\W[_]]*[eE38]+|[lL1!]+[\\W[_]]*[eE38]*)[\\W[_]]*[sS$5]*(?<=\\b|\\W)"); //asshole
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[aA4@248]+[\\W[_]]*[sS5$]+[\\W[_]]*[sS5$]+[wW]*[\\W[_]]*[hH]*[\\W[_]]*[oO0]+[\\W[_]]*[rR]+[\\W[_]]*[eE38]+(?<=\\b|\\W)"); //asswhore
		censoredWordsRegex.add("(?<=\\b|\\W)[aA4@48]+[\\W[_]]*[sS5$zZ]+[\\W[_]&&[^\\s]]*[sS5$zZ]+(?!assin|in|ume|oon|omething|ist|hotgun|uming|hot|umption|ociate|ocation|oc)[\\w&&[^\\s]]*"); //ass
		
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[fF]+[\\W[_]]*[aA4]+[\\W[_]]*[wW]+[\\W[_]]*[kKcCqQ]+[eE3rR]*[rR]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //fawk
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[fF]+[\\W[_]]*[hHeE3248]+[\\W[_]]*[cC(kKqQ]+[\\W[_]]*[kKcC]+[eE3rR]*[rR]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //feck
		censoredWordsRegex.add("(?<=\\b|\\W)[fF]+[\\W[_]]*[uU238]+[\\W[_]]*[cC(kKqQ]+[\\W[_]]*[kKcC]*[\\W[_]]*([eE3rR]*[\\W[_]]*[rR]+[\\W[_]]*|[iI1!]+[\\W[_]]*[nN]+[\\W[_]]*[gG]*)?"); //fuck
		
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[fFcC(]+[\\W[_]]*[oO0]+[\\W[_]]*[cC(kKqQwW]+[\\W[_]]*[kKcC]+[eE3rR]*[rR]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //fock
		censoredWordsRegex.add("(?<=\\b|\\W)[sS$5]+[\\W[_]]*[hH28]+[\\W[_]]*[iI1!eE2348]*[\\W[_]]*[tT7]+[eE3rR]*[rR]*(?!s)(?<=\\b|\\W)"); //shit
		censoredWordsRegex.add("(?<=\\b|\\W)[dD]+[\\W[_]]*[aA248@]+[\\W[_]]*([yY]+[\\W[_]]*[uU]+)?([mM]+[\\W[_]]*[nN]*|[nN]+[\\W[_]]*[mM]+)([iI1!|]+[\\W[_]]*[tT7]+)?(?<=\\b|\\W)"); //damn
		
		
		censoredWordsRegex.add("(?<=\\b|\\W)[nN]+[\\W[_]]*[iI1!248]+[\\W[_]]*[gG]+[\\W[_]]*[gG]+[aA48eE3]+[\\W[_]]*[rR]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //nigg(a/er)
		censoredWordsRegex.add("(?<=\\b|\\W)[bB]+[\\W[_]]*[iI1!248]*[\\W[_]]*[tT7sS$5]+[\\W[_]]*[sS$52cC(]+[\\W[_]]*[hH]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //bitch
		censoredWordsRegex.add("(?<=\\b|\\W)[bB]+[\\W[_]]*[iI1|!248eE3]*[\\W[_]]*[sS$5]+[\\W[_]]*[cC(hH]+(?<=\\b|\\W)"); //b[i/e]sh
		censoredWordsRegex.add("(?<=\\b|\\W)[dD]+[\\W[_]]*[iI1!|248]+[\\W[_]]*[cCkKqQ(]+[\\W[_]]*[kKcCqQ(]*(?<=\\b|\\W)"); //dick
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[cC(]+[\\W[_]]*[uU28]+[\\W[_]]*[nN]+[\\W[_]]*[tT7]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //cunt
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[cC(kK]+[\\W[_]]*[lL1!]+[\\W[_]]*[iI1!]+[\\W[_]]*[tT7]+[eE3248]*[\\W[_]]*[rR]*[\\W[_]]*[uU]*[\\W[_]]*[sS$52]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //cliterus
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[bB]+[\\W[_]]*[uU248]+[\\W[_]]*[lL1!|]+[\\W[_]]*[lL1!|]+[sS$52]+[\\W[_]]*[hH]+[\\W[_]]*[iI1!|]+[\\W[_]]*[tT7]+[eE3rR]*[rR]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //bullshit
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[bB]+[\\W[_]]*[aA428]+[\\W[_]]*[sS$52]+[\\W[_]]*[tT7]+[\\W[_]]*[aA4]*[\\[W[_]]*[rR]*[\\W[_]]*[dD]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //bastard
		censoredWordsRegex.add("[\\w&&[^\\s]]*[sS$5]+[\\W[_]]*[lL1!|]+[\\W[_]]*[uU248]+[\\W[_]]*[tT7]+[\\w&&[^\\s]]*"); //slut
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[wW]+[\\W[_]]*[hH]+[\\W[_]]*[oO0248]+[\\W[_]]*[rR]+[\\W[_]]*[eE3]*[\\w&&[^\\s]]*(?<=\\b|\\W)"); //whore
		censoredWordsRegex.add("(?<=\\b|\\W)(?!g)[rR]+[\\W[_]]*[aA248]+[\\W[_]]*[pP]+[\\W[_]]*[eE3]+(?!ople|rk)(?<=\\b|\\W)"); //rape
		censoredWordsRegex.add("(?<=\\b|\\W)[\\w&&[^\\s]]*[mM]+[\\W[_]]*[eE2348]+[\\W[_]]*[tT7]+[\\W[_]]*[hH]+(?<=\\b|\\W)"); //meth
		censoredWordsRegex.add("[\\w&&[^\\s]]*[cC]+[\\W[_]]*[oO0248]+[\\W[_]]*[cC]+[\\W[_]]*[aA248]+[\\W[_]]*[iI1!|]*[\\W[_]]*[nN]+[\\W[_]]*[eE3]*"); //cocaine
		
		censoredWordsRegex.add("[pP]+[\\W[_]]*[eE2348]*[\\W[_]]*[nN]+[\\W[_]]*[iI1!|]+[\\W[_]]*[sS2$5]+"); //penis
		
		censoredWordsRegex.add("[pP]+[\\W[_]]*[oO0-9]+[\\W[_]]*[rR]+[\\W[_]]*[nN]+"); //porn
		censoredWordsRegex.add("[bB]+[\\W[_]]*([oO0][\\W[_]]*){2}[bB]+(?!o+)"); //boobs
		censoredWordsRegex.add("(?<=\\b|\\W)[tT7]+[\\W[_]]*[1!|iI]+[\\W[_]]*[tT7]+[\\W[_]]*[sS$52]*[\\W[_]]*[tT7]+[\\W[_]]*[iI1!|]*[\\W[_]]*[eE3]*[\\W[_]]*[sS$25]+(?<=\\b|\\W)"); //tittes
		censoredWordsRegex.add("(?<![\\W])(?<=\\b|\\W)[tT7]+[\\W[_]]*[1!|iI]+[\\W[_]]*[tT7]+[\\W[_]]*[sS$52]*(?<=\\b|\\W)"); //tits
		
		
		censoredWordsRegex.add("(?<=\\b|\\W)([fF]+[\\W[_]]*[aA2348]+[\\W[_]]*[gG]+[\\W[_]]*)([gG]*[\\W[_]]*[oO02348]+[\\W[_]]*[tT7]+)?(?<=\\b|\\W)"); //faggot
		
		censoredWordsRegex.add("(?<=\\b|\\W)(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)[\\W[_]]){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)[:]*([\\W[_]]*([0-9]+))?(?<=\\b|\\W)"); //ip censor
		
		censoredWordsRegex.add("(?<=\\b|\\W)([kK][\\W[_]]*){3}(?<=\\b|\\W)"); //kkk
		
		censoredWordsRegex.add("[\\(]+[\\W[_]]*([\\s]*[\\W[_]]*[\\.]+[\\W[_]]*[\\s]*[\\W[_]]*)+[yY]+[\\W[_]]*([\\s]*[\\W[_]]*[\\.]+[\\W[_]]*[\\s]*[\\W[_]]*)+[\\)]+"); //( . Y . )
		
		censoredWordsRegex.add("[pP]+[\\W[_]]*[uU]+[\\W[_]]*([sS25$]+[\\W[_]]*)+([yY]+|[iI1!|]+[\\W[_]]*[eE3]*|[iI1!|]*[\\W[_]]*[eE3]+)+([\\W[_]]*[sS$5]+)?"); //pussies
		
		censoredWordsRegex.add("play[\\W[_]]*mineport[\\W[_]]*com");
		
		//websites
		censoredWordsRegex.add("^(play.dtfactions.com)$([a-zA-Z0-9_\\-]+[\\W_]*(\\.|\\([\\W_]*\\.[\\W_]*\\)[\\W_]*|\\([\\W_]*d[\\W_]*o[\\W_]*t[\\W_]*\\)[\\W_]*)+)+[\\W_]*(c[\\W_]*o[\\W_]*m[\\W_]*|n[\\W_]*e[\\W_]*t[\\W_]*|l[\\W_]*a[\\W_]*n[\\W_]*d[\\W_]*|h[\\W_]*u[\\W_]*b[\\W_]*)");
		
		for (String regex : censoredWordsRegex) {
			/*String temp = next;
			Pattern pat = Pattern.compile(regex);
			Matcher mat = pat.matcher(message);
			String stars = "*";
			if (mat.find()) {
				int length = mat.group(0).length();
				for (int x = 1; x != length; x += 1) {
					if (!(mat.group(0).charAt(x) == ' ')) {
						stars += "*";
					} else {
						stars += " ";					
					}
				}
				next = temp.replaceFirst(regex, stars);
				mat = pat.matcher(next);
			}
			next = temp.replaceAll(regex, stars);*/
			String temp = next;
			Pattern pat = Pattern.compile(regex);
			Matcher mat = pat.matcher(message);
			String stars = "*";
			if (mat.find()) {
				int found = 1;
				while (mat.find()) {
					found++;
				}
				mat = Pattern.compile(regex).matcher(next);
				for (int a = 0; a < found; a++) {
					int length = mat.group(a).length();
					for (int x = 1; x != length; x += 1) {
						stars += "*";
					}
					next = temp.replaceFirst(regex, stars);
				}
			}
		}
		return next;
	}
}