describe("Audition JavaScript Tests", function() {

  it("SpecRunner runs", function() {
    expect(JavaScriptAudition.itRuns()).toBeTruthy();
  });

  when("Using a Number in Words converter", function(){
    var subject;

    beforeEach(function(){
      subject = NumberInWords();
    });

    when("entering a number between 1 and 9", function(){
      it("returns one correctly", function(){
        expect(subject.convert("1 $")).toEqual("one dollar");
      });

      it("returns two correctly", function(){
        expect(subject.convert("2 $")).toEqual("two dollars");
      });

      it("returns three correctly", function(){
        expect(subject.convert("3 $")).toEqual("three dollars");
      });

      it("returns four correctly", function(){
        expect(subject.convert("4 $")).toEqual("four dollars");
      });

      it("returns five correctly", function(){
        expect(subject.convert("5 $")).toEqual("five dollars");
      });

      it("returns six correctly", function(){
        expect(subject.convert("6 $")).toEqual("six dollars");
      });

      it("returns seven correctly", function(){
        expect(subject.convert("7 $")).toEqual("seven dollars");
      });

      it("returns eight correctly", function(){
        expect(subject.convert("8 $")).toEqual("eight dollars");
      });

      it("returns nine correctly", function(){
        expect(subject.convert("9 $")).toEqual("nine dollars");
      });

      it("returns zero correctly", function(){
        expect(subject.convert("0 $")).toEqual("zero dollars");
      });
    });

    when("entering a number between 10 and 19", function(){
      it("returns ten correctly", function(){
        expect(subject.convert("10 $")).toEqual("ten dollars");
      });

      it("returns eleven correctly", function(){
        expect(subject.convert("11 $")).toEqual("eleven dollars");
      });

      it("returns twelve correctly", function(){
        expect(subject.convert("12 $")).toEqual("twelve dollars");
      });

      it("returns thirteen correctly", function(){
        expect(subject.convert("13 $")).toEqual("thirteen dollars");
      });

      it("returns fourteen correctly", function(){
        expect(subject.convert("14 $")).toEqual("fourteen dollars");
      });

      it("returns fifteen correctly", function(){
        expect(subject.convert("15 $")).toEqual("fifteen dollars");
      });

      it("returns sixteen correctly", function(){
        expect(subject.convert("16 $")).toEqual("sixteen dollars");
      });

      it("returns seventeen correctly", function(){
        expect(subject.convert("17 $")).toEqual("seventeen dollars");
      });

      it("returns eigthteen correctly", function(){
        expect(subject.convert("18 $")).toEqual("eighteen dollars");
      });

      it("returns nineteen correctly", function(){
        expect(subject.convert("19 $")).toEqual("nineteen dollars");
      });
    });

    when("entering a number divisble by 10 (but not 10)", function(){
      it("returns twenty correctly", function(){
        expect(subject.convert("20 $")).toEqual("twenty dollars");
      });

      it("returns thrity correctly", function(){
        expect(subject.convert("30 $")).toEqual("thirty dollars");
      });

      it("returns fourty correctly", function(){
        expect(subject.convert("40 $")).toEqual("fourty dollars");
      });

      it("returns fifty correctly", function(){
        expect(subject.convert("50 $")).toEqual("fifty dollars");
      });

      it("returns sixty correctly", function(){
        expect(subject.convert("60 $")).toEqual("sixty dollars");
      });

      it("returns seventy correctly", function(){
        expect(subject.convert("70 $")).toEqual("seventy dollars");
      });

      it("returns eighty correctly", function(){
        expect(subject.convert("80 $")).toEqual("eighty dollars");
      });

      it("returns ninety correctly", function(){
        expect(subject.convert("90 $")).toEqual("ninety dollars");
      });
    });

    when("entering a number greater than 20 but less than 100", function(){
      it("returns twenty two correctly", function(){
        expect(subject.convert("22 $")).toEqual("twenty two dollars");
      });

      it("return thrity one correctly", function(){
        expect(subject.convert("31 $")).toEqual("thirty one dollars");
      });

      it("return fourty three correctly", function(){
        expect(subject.convert("43 $")).toEqual("fourty three dollars");
      });
    });

    when("entering a number greater than 100 but less than 1000", function(){
      it("returns one hundred ninety five correctly", function(){
        expect(subject.convert("195 $")).toEqual("one hundred ninety five dollars");
      });
    });

    when("entering a number greater than 1000", function(){
      it("returns one thousand one hundred ninety five correctly", function(){
        expect(subject.convert("1195 $")).toEqual("one thousand one hundred ninety five dollars");
      });

      it("returns nine hundred ninety nine thousand nine hundred ninety nine", function(){
        expect(subject.convert("999999 $")).toEqual("nine hundred ninety nine thousand nine hundred ninety nine dollars");
      });
    });
  });
});
