JCalendarButton is a simple java swing component that displays
a popup calendar or time when a user click the calendar icon next to a date.

My intention in publishing this project is to assist fellow programmers
in reusing the code that I have developed.

It is released under the GPL3 License. To me this seems like the least
restrictive license. If you need another license, I will gladly create a
private release for you with that license. If you need a release, I'll sign it.

A few simple examples and development tool integration can be found at:
http://jcalendarbutton.sourceforge.net

Enjoy!

Don <don@donandann.com>

Notes:

The maven repository is:
<dependency>
 <groupId>org.jbundle.thin.base.screen</groupId>
 <artifactId>jcalendarbutton</artifactId>
 <version>1.4.5</version>
<dependency>

The repository is located at:
http://jcalendarbutton.hg.sourceforge.net:8000/hgroot/jcalendarbutton/jcalendarbutton

To release the project:
1. mvn deploy
2. See if if snapshot looks okay
- Next:
1. ssh -t doncorley,jcalendarbutton@shell.sourceforge.net create
2. mvn release:prepare
3. mvn release:perform
4. go to http://oss.sonatype.org close it and promote it

You're done!