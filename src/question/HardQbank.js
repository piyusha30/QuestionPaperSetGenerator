const HardQbank = [
  {
    question: "Which of the following is the actual IP address?",
    answers: ["(a) Inside local address",

      "(b) Inside global address",
         
      "(c) Outside local address",
     
      "(d) WAN]"],
    correct: "(c) Outside local address",
    questionId: "0991099",
  },
  {
    question: "Which of the following ( is a Network address translation)  can be used to have one IP address that allows many users the browsing?",
    answers: ["(a) Intranet",

    "(b) NAT",
   
   
    "(c)  PAT",
   
    "(d) Mesh",
   
   " (e) Dynamic"],
    correct: "(c)  PAT",
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
    question: "Which of the following WLAN specification at 2.4 GHz allows up to 54 Mbps?",

   answers: ["(a) A",
   
    "(b) F",
   
    "(c) G",
   
    "(d) B"],
    correct: "c",
    questionId: "090089",
  },
  {
    question: "For the IOS backup which command we shall use?",

    answers:["(a) IOS Disk backup",
   
    "(b) IOS TFTP copy",
   
    "(c) Copy Flash TFTP",
   
    "(d) Any of the above",
   
    "(e) None of these",],
    correct: "vinayak",
    questionId: "01010101",
  },
{
    question: "What does PoP stand for?",
    answers: ["Pre Office Protoco",
   
    "Post Office Protocol",
   
    "Protocol of Post",
   
    "None"],
    correct: "Post Office Protocol",
    questionId: "0991099",
  },
  {
    question: "What is the port number of PoP?",
    answers: ["35",
   
    "43",
   
    "110",
   
    "25"],
    correct: "110",
    questionId: "093909",
  },
  {
    question: "What is the number of layers in the OSI model?",
    answers: ["2 layers",
   
    "4 layers",
   
    "7 layers",
   
    "9 layers"],
    correct: "7 layers",
    questionId: "009039",
  },
{
    question: "The full form of OSI is?",
    answers: ["Operating System interface",
   
    "Optical System interconnection",
   
    "Operating System Internet",
   
    "Open system interconnection"],
    correct: "Open system interconnection",
    questionId: "090089",
  },
  {
    question: " Identify the layer which provides service to the user.",
    answers: ["Session layer",
   
    "Application layer",
   
    "Presentation error",
   
    "Physical layer"],
    correct: "Application laye",
    questionId: "01010101",
  },
 
];

export default (n = 5) => HardQbank.sort(() => 0.5 - Math.random()).slice(0, n);