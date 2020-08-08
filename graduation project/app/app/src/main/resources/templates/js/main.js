function sendJSON(){

    let result = document.querySelector('.result');
    let email = document.querySelector('#email');
    let password = document.querySelector('#password');

    // Creating a XHR object
    let xhr = new XMLHttpRequest();
    let url = "http://localhost:8282/login";

    // open a connection
    xhr.open("POST", url, true);

    // Set the request header i.e. which type of content you are sending
    xhr.setRequestHeader("Content-Type", "application/json");

    // Create a state change callback
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {

            // Print received data from server
            result.innerHTML = this.responseText;
            console.log(this.responseText)


        }
    };

    // Converting JSON data to string
    var data = JSON.stringify({ "password": password.value, "email": email.value });
    console.log(this.data)

    // Sending data with the request
    xhr.send(data);

}




/**function sendJSON(){
            
            let result = document.querySelector('.result'); 
            let name = document.querySelector('#email'); 
            let email = document.querySelector('#password'); 
            
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
            var url = "https://jsonplaceholder.typicode.com/users";
        
            // open a connection 
            xhr.open("POST", url);

            // Set the request header i.e. which type of content you are sending 
            xhr.setRequestHeader("Content-Type", "application/json");
    document.getElementsByClassName('result').innerHTML="nooo";


            // Create a state change callback 
            xhr.onreadystatechange = function () { 
                if (xhr.readyState === 4 && xhr.status === 200) { 

                    // Print received data from server 
                   document.getElementsByClassName('result').innerHTML = this.responseText;
                    console.log(this.responseText);
                    alert(document.getElementsByClassName('result').innerHTML);

                }
                else
                {
                    result.innerHTML="not oook";
                    alert(document.getElementsByClassName('result').innerHTML);

                }


            }; 
        //alert(xhr.status);

            // Converting JSON data to string 
            var data = JSON.stringify({ "email": email.value, "password": password.value });
            //alert(data);
            // Sending data with the request 
            xhr.send(data); 
        } **/
