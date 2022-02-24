fun main(){
    val socialApp = arrayOf("Facebook", "Instagram", "WhatsApp", "Twitter","SnapChat","Tiktok")
   //step1
    for(app in socialApp) {
        print(app + " ")
    }
    //step2
    for (app in socialApp){
        if(app.equals("Instagram")||app.equals("SnapChat")){
            continue
        }
        print(app + " ")
    }
    //step3
    print("insert value to update: ")
    var willEdited = readln()!!.toString()
    for(i in socialApp.indices){
        if(socialApp[i].equals(willEdited)){
            print("new value is : ")
            var newValue= readln()!!.toString()
            socialApp[i] = newValue
            break
        }


    }

    //step4
        for(app in socialApp) {
        println(app + " ")
    }

}