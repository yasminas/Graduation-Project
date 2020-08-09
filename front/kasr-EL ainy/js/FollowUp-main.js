
function sendJSON(){ 
            
             var result = document.getElementsByClassName("result");
            var aed_modifing = document.querySelector('input[name =AED]:checked');

            var frequency_per_month =  document.getElementById("frequency_per_month");
    var typeArea =  document.getElementById("typeArea");
    var aedM =  document.getElementById("aedM");
    var SpecifyComplain =  document.getElementById("SpecifyComplain");

            var compliant_on_AED =document.querySelector('input[name = AEDcomplaint]:checked');
               // document.getElementById("compliant_on_AED");



    var checkboxes = document.getElementsByName('trigger');
    var vals = "";
    for (var i=0, n=checkboxes.length;i<n;i++)
    {
        if (checkboxes[i].checked)
        {
            vals += ","+checkboxes[i].value;
        }
    }
    if (vals) vals = vals.substring(1);


            var last_visit = document.querySelector('input[name = LastVisit]:checked');
            //document.querySelector('input[name = AEDcomplaint]:checked');
            
            var last_visit_seizure = document.getElementById("last_visit_seizure");
            var same_seizure_type = document.querySelector('input[name = Type]:checked');

            
            var triggering_factors = document.getElementById("triggering_factors");
    var SpecifyComplain = document.getElementById("SpecifyComplain");

            
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            let url = "http://localhost:8282/follow";
        
            // open a connection 
            xhr.open("POST", url, true); 

            // Set the request header i.e. which type of content you are sending 
            xhr.setRequestHeader("Content-Type", "application/json"); 

            // Create a state change callback 
            xhr.onreadystatechange = function () { 
                if (xhr.readyState === 4 && xhr.status === 200) { 

                    // Print received data from server 
                    result.innerHTML = this.responseText;
                    console.log(this.responseText);


                } 
            }; 



            // Converting JSON data to string 
            var data = JSON.stringify({ "aed_modifing": aed_modifing.value, "compliant_on_AED": compliant_on_AED.value ,
                "frequency_per_month" : frequency_per_month.value , "last_visit" : last_visit.value ,
                "last_visit_seizure" :last_visit_seizure.value , "same_seizure_type":same_seizure_type.value,
                "triggering_factors":vals
                ,"SpecifyComplain" : SpecifyComplain.value ,"typeArea":typeArea.value,
                "aedM":aedM.value

             });



            // Sending data with the request 
            xhr.send(data);
            console.log("true");
            console.log(data);
        } 
