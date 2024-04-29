async function verifyUser() {
    const userName = document.getElementById("userName").value;
    const response = await fetch('http://localhost:8080/processApplication', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name: userName })
    });

    if (response.ok) {
        const data = await response.json();
        document.getElementById("result").innerText = "User's Name: " + data.name;
    } else {
        document.getElementById("result").innerText = "Error verifying applicant.";
    }
}
