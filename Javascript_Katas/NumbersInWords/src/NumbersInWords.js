NumberInWords = function(){
  var ones = ["", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
  var teens = ["ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"];
  var tens = ["", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"];
  var lengthOfNumber;

  function convert(inputNumber){
    var number = toNumber(inputNumber);
    if(number === 0){
      return "zero dollars";
    }
    return removeDoubleSpaces(toWord(number) + getType(number));
  }

  function toWord(number){
    if(number < 20) return processLessThanTwenty(number);
    var modulusNumberOfAwesomeNess = getModulusNumber();
    lengthOfNumber--;
    var single = number % modulusNumberOfAwesomeNess;
    var double = number - single;
    return processHundreds(double, modulusNumberOfAwesomeNess) + " " + toWord(single);
  }

  function processHundreds(number, modulusValue){
    if(number > 999) return toWord(number / 1000) + " thousand";
    return number > 99 ? toWord(number / modulusValue) + " hundred" : tens[number / 10];
  }

  function processLessThanTwenty(number){
    return number < 10 ? ones[number] : teens[number % 10];
  }

  function toNumber(numberString){
    numberString = numberString.split(" ")[0];
    lengthOfNumber = numberString.length;
    return Number(numberString);
  }

  function getModulusNumber(){
    return Math.pow(10, lengthOfNumber - 1);
  }

  function getType(number){
    return number === 1 ? " dollar" : " dollars";
  }

  function removeDoubleSpaces(word){
    return word.replace("  ", " ")
  }

  return{
    convert: convert
  }
};
