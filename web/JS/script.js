/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


async function sendObjects() {

    const userArray = [
        {
            id: 1,
            name: "Upek",
            age: 20,
            country: "Sri Lanka"
        },
        {
            id: 2,
            name: "Mudith",
            age: 18,
            country: "Australia"
        }
    ];

    const response = await fetch("X", {
        method: "POST",
        body: JSON.stringify(userArray),
        headers: {
            "Content-Type": "application/json"
        }
    });

    if (response.ok) {

        const json = await response.json();
        console.log(json.message);

    }

}