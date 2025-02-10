const EasyQbank= [
  {
    question: "IP address 192.168.168.188.255.255.255.192 has there a place on which of the following valid IP host ranges?",
   
    answers: ["(a) 192.168.168.129-190",
   
    "(b) 192.168.168.129-152",
   
    "(c) 192.168.168.129-192",
   
    "(d) 192.168.152.129-151",
   
    "(e) None of these"],
    correct: "(a) 192.168.168.129-190",
    questionId: "0991099",
  },
  {
    question: "To set a Telnet password on a cisco router we set a command called?",
    answers: ["(a) line con 0",
   
    "(b) line telnet 0 4",
   
    "(c) line con  1",
   
    "(d) line vty 0 4",
   
    "(e) None of these"],
    correct: "(d) line vty 0 4",
    questionId: "093909",
  },
  {
    question: "Which of the following commands is used to create a configurational backup?",
    answers: ["(a) Running back & copy",
   
    "(b) Copy running-config startup-config",
   
    "(c) Configurational Mem",
   
    "(d) Wr Mem",
   
    "(e) None of the above"],
    correct: "(b) Copy running-config startup-config",
    questionId: "009039",
  },
  {
    question: "A device that can connect to a network without a cable is referred to as-",


   answers: ["(a) Distributed device",
   
    "(b) Centralized device",
   
    "(c) Open-source device",
   
    "(d) Wireless device",
   
    "(e) None of these"],
    correct: "(d) Wireless device",
    questionId: "090089",
  },
  {
    question: "The most affordable MODEMs can transmit-",

    answers:["(a) 300 bits per second",
   
    "(b) 1,200 bits per second",
   
   "(c) 2,400 bits per second",
   
    "(d) 1600 bits per second",
   
    "(e) 3600 bits per second"],
    correct: "(b) 1,200 bits per second",
    questionId: "01010101",
  },

  {
      question: " Stub in a network is known as:",

      answers:["(a) Having only one exit and one entry point",
     
      "(b) Having more than one entry point",
     
      "(c) Having no Exit point",
     
      "(d) Having more than one exit point",
     
      "(e) No exit and no entry point"],
      correct: "(a) Having only one exit and one entry point",
      questionId: "01010101",
    },

    {
      question: "Class of IP address which has the most number of hosts available?",

      answers:["(a)  A and B",
     
      "(b) A",
     
      "(c) B and C",
     
      "(d) D",
     
      "(e) None of these"],
      correct: "(b) A",
      questionId: "01010101",
    },

    {
      question: "Class of IP address which has the most number of hosts available?",

      answers:["(a)  A and B",
     
      "(b) A",
     
      "(c) B and C",
     
      "(d) D",
     
      "(e) None of these"],
      correct: "(b) A",
      questionId: "01010101",
    },
{
    question: "What is the collection of the hyperlinked document on the internet known as?",
    answers: ["HTML",
    
    "Email",
    
    "WWW",
    
    "Internet"],
    correct: "WWW",
    questionId: "09459099",
  },
  {
    question: "Identify the incorrect network topology",
    answers: ["Bus",
    
    "Star",
    
    "P2P",
    
    "Ring"],
    correct: "P2P",
    questionId: "0912219099",
  },
 
];

export default (n = 5) => EasyQbank.sort(() => 0.5 - Math.random()).slice(0, n);