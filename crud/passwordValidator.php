<?php
function validatePassword($password) {
    $errors = []; // Initialize empty error array

    // Check length (8-16 characters)
    $length = strlen($password);
    if ($length < 8 || $length > 16) {
        $errors[] = "Password must be between 8 and 16 characters.";
    }

    $hasUppercase = false;
    $hasLowercase = false;
    $hasNumber = false;
    $hasSpecialChar = false;
    $specialChars = "@$!%*?&";

    // Loop through each character in the password
    for ($i = 0; $i < $length; $i++) {
        $char = $password[$i];

        if (ctype_upper($char)) {
            $hasUppercase = true;
        } elseif (ctype_lower($char)) {
            $hasLowercase = true;
        } elseif (ctype_digit($char)) {
            $hasNumber = true;
        } elseif (strpos($specialChars, $char) !== false) {
            $hasSpecialChar = true;
        }
    }

    // Add errors if conditions are not met
    if (!$hasUppercase) {
        $errors[] = "Password must contain at least one uppercase letter.";
    }
    if (!$hasLowercase) {
        $errors[] = "Password must contain at least one lowercase letter.";
    }
    if (!$hasNumber) {
        $errors[] = "Password must contain at least one number.";
    }
    if (!$hasSpecialChar) {
        $errors[] = "Password must contain at least one special character (@$!%*?&).";
    }

    // If there are no errors, return an empty array
    return $errors;
}

// Test cases
$passwords = ["Hello@123", "hello123", "HELLO@123", "Hi@1", "HelloWorld@123456"];

foreach ($passwords as $password) {
    $errors = validatePassword($password);
    echo "Password: $password\n";
    if (empty($errors)) {
        echo "Valid password!\n\n";
    } else {
        echo implode("\n", $errors) . "\n\n"; // Print all errors
    }
}
?>
