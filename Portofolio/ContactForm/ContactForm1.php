<?php
	$name = $_POST['name'];
	$visitor_email = $_POST['email'];
	$message = $_POST['message'];

	$email_from = 'coacoa1717@gmail.com';

	$email_subject = "New Form Submission";

	$email_body = "User Name: $name. \n".
					"User Email: $visitor_email.\n."
						"User Message: $Message.\n.";


	$to = "marianto0017@gmail.com";

	$headers = "from: $email_from \r\n";

	$headers = "replay-to: $visitor_email \r\n";

	mail($to,$email_subject,$email_body,$headers);

	header("location: ContactForm.html");
