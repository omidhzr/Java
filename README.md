# Java
Java Socket programming projects
You will need some servers to test against. Here are some suggestions.


Daytime	time.nist.gov	13	–	
Public server. Note that this server has limitations
for how frequently you can query it (at most once 
every four seconds). 

examples:
java TCPAsk time.nist.gov 13
java TCPAsk java.lab.ssvl.kth.se hello world!

Daytime	java.lab.ssvl.kth.se	13	–	
Whois	whois.iis.se	43	Name 	
Whois	whois.internic.net	43	Name	    :Returns domains information
Echo	java.lab.ssvl.kth.se	7	String	  :Returns whatever data it receives. 
Discard	java.lab.ssvl.kth.se	9	String  :Drops whatever data it receives.
Chargen	java.lab.ssvl.kth.se	19	–     :Generates stream of characters.

