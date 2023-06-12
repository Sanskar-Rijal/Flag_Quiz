package com.example.revision

object Constants
{
    const val user_name:String="username"
    const val total_Question:String="totalques"
    const val Correct_answer:String="correctans"
    fun getquestions():ArrayList<Questions>
    {
        val questionslist= arrayListOf<Questions>()
        //question1
        val question1=Questions(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "BOTSWANA",
        "AFGHANISTAN",
            "ARGENTINA",
            "CANADA",
            3
        )
        //qsn2
        val question2=Questions(
            2,"What country does this flag belong to?"
        ,R.drawable.ic_flag_of_australia,
            "BRAZIL","BELGIUM",
        "NEPAL","AUSTRALIA",4
        )
        //qsn3
        val ques3=Questions(
            3,"What country does this flag belong to?"
        ,R.drawable.ic_flag_of_belgium,
            "INDIA"
        ,"BELGIUM"
        ,"GERMANY"
        ,"ITALY"
        ,2
        )
        //qsn 4
        val question4= Questions(
            4,"What country does this flag belong to?"
        ,R.drawable.ic_flag_of_brazil,
            "BRAZIL",
            "PORTUGAL",
        "QUATAR",
            "ROMANIA"
            ,1
        )
        //question 5
        val question5= Questions(
            5,
            "What country does this flag belong to?"
        ,R.drawable.ic_flag_of_denmark,
            "SWITZERLAND",
        "TONGA",
        "PERU"
        ,"DENMARK",
            4
        )
        //question 6
        val question6= Questions(
            5,"What country does the flag belong to?"
        ,R.drawable.ic_flag_of_fiji,
            "FIJI","AMERICA",
            "EGYPT","CYPRUS"
        ,1
        )
        //question 7
        val question7=Questions(
            7,"What country does the flag belong to?"
        ,R.drawable.ic_flag_of_germany,
            "BELGIUM","GERMANY","EGYPT","RUSSIA",
            2
        )
        // question 8
        val question8=Questions(
            8,"What country does this flag belong to?"
        ,R.drawable.ic_flag_of_india,
            "NEPAL",
        "PAKISTAN",
        "CHINA",
        "INDIA",
            4
        )
        //question 9
        val question9=Questions(
            9,"What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "BANGLADESH",
        "BHUTAN",
            "KUWAIT"
        ,"AUSTRIA",
            3
        )
        //question 10
        val question10=Questions(
            10,"What country does this flag belong to?"
        ,R.drawable.ic_flag_of_new_zealand,
            "NEW ZEALAND",
        "GHANA","HUNGARY",
            "IRAN",1
        )
        //question 11
        val question11=Questions(
            11,"What country does this flag belong to?"
        ,
            R.drawable.nepal,
            "INDIA",
            "CHINA",
            "NEPAL"
        ,"PAKISTAN",3
        )
        //question12
        val question12=Questions(12,"What country does this flag belong to?"
            ,R.drawable.afghanistan,
            "AFGHANISTAN",
            "DOMINICA",
            "ECUADOR",
            "ESTONIA",1)
        //question13
        val question13=Questions(13,"What country does this flag belong to?"
            ,R.drawable.albania,"CHILE"
            ,"ALBANIA"
            ,"BAHRAIN"
            ,"COLOMBIA",
            2)
        //question 3
        val question14=Questions(14,"What country does this flag belong to?",
            R.drawable.algeria,
            "ALGERIA",
            "HONDURAS",
            "GABON",
            "BELIZE",1)
        // question 4
        val question15=Questions(15,"What country does this flag belong to?"
            ,R.drawable.bhutan,
            "CHILE",
            "CANADA",
            "MOROCCO",
            "BHUTAN",4)
        //question 5
        val question16=Questions(16,"What country does this flag belong to?",
            R.drawable.chile,
            "KYRGYZSTAN",
            "MOROCCO",
            "CHILE",
            "NEW ZEALAND",3)
        //question6
        val question17=Questions(17,"What country does this flag belong to?",
            R.drawable.china,
            "NEPAL",
            "BELIZE",
            "CHINA",
            "BHUTAN",3)
        // question 7
        val question18=Questions(18,"What country does this flag belong to?",
            R.drawable.dominican,
            "OMAN",
            "PARAGUAY",
            "DOMINICAIN",
            "KUWAIT",3)
        //question 8
        val question19=Questions(19,"What country does this flag belong to?",
            R.drawable.finland,"FINLAND"
            ,"MALDIVES"
            ,"NAMIBIA"
            ,"POLAND",1)
        //question9
        val question20=Questions(20,"What country does this flag belong to?",R.drawable.georgia,
            "GEORGIA"
            ,"HUNGARY"
            ,"ICELAND"
            ,"INDONESIA",1)
        //quesiton10
        val question21=Questions(21,"What country does this flag belong to?"
            ,R.drawable.greece,"AUSTRIA"
            ,"GREECE"
            ,"BENIN"
            ,"BARBADOS",2)
        //question11
        val question22=Questions(22,"What country does this flag belong to?"
            ,R.drawable.iceland,
            "MONACO",
            "ICELAND",
            "NEPAL",
            "NORTH KOREA",2)
        //question12
        val question23=Questions(23,"What country does this flag belong to?"
            ,R.drawable.indonesia,
            "NORWAY",
            "POLAND",
            "INDONESIA",
            "PAKISTAN",3)
        //question13
        val question24=Questions(24,"What country does this flag belong to?",
            R.drawable.ireland,
            "IRELAND",
            "RUSSIA",
            "SPAIN",
            "TUNISIA",1)
        //question 14
        val question25=Questions(25,"What country does this flag belong to?",
            R.drawable.italy,
            " ITALY",
            "URUGUAY",
            "DOMINICA",
            "FRANCE",1)
        //question 15
        val  question26=Questions(26,"What country does this flag belong to?",
            R.drawable.mauritius,
            "CANADA",
            "MAURITIUS",
            "CYPRUS","CAMBODIA"
            ,2)
        val  question27=Questions(27,"What country does this flag belong to?",
            R.drawable.mexico,
            "CYPRUS",
            "ECUADOR",
            "MEXICO",
            "GRENADA",3)
        val  question28=Questions(28,"What country does this flag belong to?",
            R.drawable.morocco,
            "DENMARK",
            "MOROCCO",
            "FRANCE",
            "ECUADOR",2)
        val  question29=Questions(29,"What country does this flag belong to?",
            R.drawable.niger,
            "NIGER",
            "GRENADA",
            "HAITI",
            "INDIA",1)
        val  question30=Questions(30,"What country does this flag belong to?",
            R.drawable.nigeria,
            "JAPAN",
            "ICELAND",
            "NIGERIA",
            "ITALY",3)
        val  question31=Questions(31,"What country does this flag belong to?",
            R.drawable.qatar,
            "QATAR",
            "PAKISTAN",
            "ITALY",
            "RWANDA",1)
        val  question32=Questions(32,"What country does this flag belong to?"
            ,R.drawable.rwanda,
            "KENYA",
            "LIBERIA",
            "RWANDA",
            "BELGIUM",3)
        val  question33=Questions(33,"What country does this flag belong to?",R.drawable.saudiarabia
            ,"BRAZIL",
            "GREECE","SAUDI ARABIA",
            "FIJI",3)
        val  question34=Questions(34,"What country does this flag belong to?",
            R.drawable.sweden,
            "HUNGARY",
            "IRAN",
            "SWEDEN",
            "JAMAICA",3)
        val  question35=Questions(35,"What country does this flag belong to?",
            R.drawable.mauritius,
            "UNITED KINGDOM",
            "MAURITIUS",
            "KAZAKHSTAN",
            "LAOS",2)
        val  question36=Questions(36,"What country does this flag belong to?",R.drawable.zimbabwe,
            "MOROCCO",
            "ZIMBABW",
            "NAURU",
            "IRELAND",2)
        val  question37=Questions(37,"What country does this flag belong to?",
            R.drawable.iceland,
            "Iceland",
            "AUSTRALIA",
            "UKRANE",
            "NARU",1)
        val  question38=Questions(38,"What country does this flag belong to?",R.drawable.philippines
            ,"DOMINICA",
            "CYPRUS",
            "BARBADOS",
            "Philippines",4)
        val  question39=Questions(39,"What country does this flag belong to?",
            R.drawable.malaysia,
            "AUSTRALIA",
            "ANGOLA",
            "MALAYSIA",
            "CAMBODIA",3)
        val  question40=Questions(40,"What country does this flag belong to?",
            R.drawable.benin,
            "Benin",
            "COSTA RICA",
            "GUYANA",
            "HONDURAS",1)
        val  question41=Questions(41,"What country does this flag belong to?",
            R.drawable.cambodia,
            "CHINA",
            "JORDAN",
            "JAPAN",
            "CAMBODIA",4)
        val  question42=Questions(42,"What country does this flag belong to?",
            R.drawable.costarica,
            "KENYA",
            "COSTARICA",
            "NORWAY",
            "ITALY",2)
        val question43=Questions(
            43,"What country does this flag belong to?",
            R.drawable.cuba,
            "ISRAEL",
            "CHILE",
            "CUBA"
            ,"CYPRUS",
            3
        )
        val question44=Questions(
        44,"What country does this flag belong to?",
        R.drawable.ecuador,
        "NAURU",
        "ECUADOR",
        "NIGER"
        ,"SERBIA",
        2
    )
        val question45=Questions(
        45,"What country does this flag belong to?",
        R.drawable.ghana,
        "SINGAPORE",
        "GABON",
        "ALGERIA"
        ,"GHANA",
        4
    )
        val question46=Questions(
        46,"What country does this flag belong to?",
        R.drawable.singapore,
        "EGYPT",
        "SINGAPORE",
        "LIBERIA"
        ,"DENMARK",
        2
    )
        val question47=Questions(
        47,"What country does this flag belong to?",
        R.drawable.serbia,
        "NORTH KOREA",
        "NAURU",
        "THAILAND"
        ,"SERBIA",
        4
    )
        val question48=Questions(
        48,"What country does this flag belong to?",
        R.drawable.spain,
        "UKRAINE",
        "TOGO",
        "VIETNAM"
        ,"SPAIN",
        4
    )
        val question49=Questions(
        49,"What country does this flag belong to?",
        R.drawable.thailand,
        "THAILAND",
        "VATICAN CITY",
        "ZAMBIA"
        ,"MALAYSIA",
        1
    )
        val question50=Questions(
        50,"What country does this flag belong to?",
        R.drawable.unitedkingdom,
        "IRAQ",
        "JAMAICA",
        "MEXICO"
        ,"UNITED KINGDOM",
        4
    )
        val question51=Questions(
        51,"What country does this flag belong to?",
        R.drawable.uruguay,
        "NAMIBIA",
        "URUGUAY",
        "RUSSIA"
        ,"SENEGAL",
        2
    )
        val question52=Questions(
            52,"What country does this flag belong to?",
            R.drawable.vaticancity,
            "SOUTH KOREA",
            "VATICAN CITY",
            "COLOMBIA"
            ,"SWEDEN",
            2
        )
        questionslist.add(question1)
        questionslist.add(question2)
        questionslist.add(ques3)
        questionslist.add(question4)
        questionslist.add(question5)
        questionslist.add(question6)
        questionslist.add(question7)
        questionslist.add(question8)
        questionslist.add(question9)
        questionslist.add(question10)
        questionslist.add(question11)
        questionslist.add(question12)
        questionslist.add(question13)
        questionslist.add(question14)
        questionslist.add(question15)
        questionslist.add(question16)
        questionslist.add(question17)
        questionslist.add(question18)
        questionslist.add(question19)
        questionslist.add(question20)
        questionslist.add(question21)
        questionslist.add(question22)
        questionslist.add(question23)
        questionslist.add(question24)
        questionslist.add(question25)
        questionslist.add(question26)
        questionslist.add(question27)
        questionslist.add(question28)
        questionslist.add(question29)
        questionslist.add(question30)
        questionslist.add(question31)
        questionslist.add(question32)
        questionslist.add(question33)
        questionslist.add(question34)
        questionslist.add(question35)
        questionslist.add(question36)
        questionslist.add(question37)
        questionslist.add(question38)
        questionslist.add(question39)
        questionslist.add(question40)
        questionslist.add(question41)
        questionslist.add(question42)
        questionslist.add(question43)
        questionslist.add(question44)
        questionslist.add(question45)
        questionslist.add(question47)
        questionslist.add(question48)
        questionslist.add(question49)
        questionslist.add(question50)
        questionslist.add(question51)
        questionslist.add(question52)
        questionslist.shuffle()
        return questionslist
    }
}