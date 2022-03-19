(function() {
 const messages = JSON.parse("{\"LXfFiQ\":\"The card number entered is incomplete.\",\"+W9rbA\":\"Please enter a CVC.\",\"nGqm+A\":\"CPF/CNPJ\",\"aReQLA\":\"Cardholder name\",\"8BhVFw\":\"The cardholder name is invalid.\",\"yd4Wkw\":\"Please enter an expiry date.\",\"D0SkXg\":\"Card number\",\"oEpd7Q\":\"E.g. Brooklyn\",\"iiyVbg\":\"We are unable to process payments with credit cards at the moment. Try using another payment method or try again in a few moments please.\",\"i0yPRQ\":\"The name you entered is more than our character limit of {0}\",\"MdtW3g\":\"Please enter a city\",\"XMzT4Q\":\"Identification document\",\"2eWAiA\":\"Please enter a street number\",\"b5S1ww\":\"We're sorry, but we can't process payment for a customer under 16 years of age.\",\"FAp3pg\":\"The email address entered is invalid.\",\"9oyRAA\":\"We couldn't reach your bank, and your payment hasn't been processed. Please reload the page and try again.\",\"NCTOJQ\":\"This card has been declined.\",\"PBlZBg\":\"The DNI entered is invalid.\",\"MtLoDQ\":\"Please enter a valid email address.\",\"taGscA\":\"Please enter a cardholder name.\",\"U0rxpw\":\"The PAN entered is invalid.\",\"O/BcGA\":\"Your payment hasn't been processed because we couldn't contact our payment provider. Please reload the page and try again.\",\"tO1SEg\":\"The cardholder name is incomplete.\",\"QdOxMw\":\"Please enter a street address\",\"x7F+jw\":\"Select a document type\",\"XObBiw\":\"CUIT\",\"stAtSQ\":\"Optional\",\"4m+jAA\":\"<span>By clicking submit, I&nbsp;warrant that this location information is accurate.</span>\",\"lY0SWA\":\"The expiry year entered is in the past.\",\"HT5m8Q\":\"The CVC entered is invalid.\",\"AVuCWQ\":\"The card verification code is invalid.\",\"FUt8eA\":\"Security code\",\"LhGbyA\":\"Apartment/Suite/Other\",\"Sq3OcA\":\"The card number entered is incorrect.\",\"qrRe5A\":\"This transaction will be processed by <a href=\\\"{0}\\\" target=\\\"_blank\\\" rel=\\\"noopener\\\">EBANX</a> or <a href=\\\"{1}\\\" target=\\\"_blank\\\" rel=\\\"noopener\\\">Dlocal</a> according to their terms. By continuing you acknowledge and accept these terms and conditions.\",\"JHaB3Q\":\"Permanent Account Number (PAN)\",\"5L9LgA\":\"CUIL\",\"XJ2qfw\":\"The expiry month entered is in the past.\",\"fz8rSQ\":\"Please enter a card number.\",\"9xi9RQ\":\"The expiry date entered is incomplete.\",\"Cd311A\":\"CUIT/CUIL/CDI/DNI\",\"+a/xVA\":\"Street number\",\"2myv/g\":\"MM / YY\",\"gnkn1g\":\"Sorry, we don't accept that type of card. Please try another payment method.\",\"7xb+4w\":\"An error occurred while processing your payment. Try again in a few moments and <a href=\\\"{0}\\\" target=\\\"_blank\\\" rel=\\\"noopener\\\">contact support</a> if the problem persists.\",\"JHafPg\":\"There are insufficient funds on your payment method. Please try another payment method or add funds to your account.\",\"xXwnCQ\":\"Expiry date\",\"K+4eYg\":\"The CDI entered is invalid.\",\"fbgf/g\":\"The CPF/CNPJ entered is invalid.\",\"zbbVPA\":\"Please enter letters only.\",\"5vGLiw\":\"This credit card isn't active. Please refer to your bank to activate your credit card.\",\"J4U6OQ\":\"The CVC entered is incomplete.\",\"5TTUIg\":\"Card number\",\"/W6VGA\":\"To authorise your card, a small amount will be charged and immediately refunded.\",\"r7TxxA\":\"E.g. Lafayette Avenue\",\"lNe/Zw\":\"The Identification number entered is invalid.\",\"R210Xw\":\"CVC\",\"V901+g\":\"DNI\",\"65o35w\":\"Please wait a moment for the form to load.\",\"kd+pEA\":\"Full name\",\"L+U/+A\":\"Email\",\"ZmIe+w\":\"CPF\",\"pd3G6g\":\"City\",\"R+BFjQ\":\"We couldn't process your payment. Please try again or use a different payment method.\",\"FhVO+g\":\"We're sorry, this credit card isn't supported. Please try another card.\",\"8hQdwQ\":\"UPI Virtual Payment Address (VPA)\",\"6F0Kiw\":\"Add manually\",\"EftY0A\":\"CDI\",\"JBa5dg\":\"Street address\",\"+Rew0Q\":\"Email address\",\"VRbCZQ\":\"This card has expired.\",\"BbyNqw\":\"Verify\",\"J/mqpQ\":\"Search for address\",\"7d4k+A\":\"The security code entered is incomplete.\",\"BwU/0w\":\"The expiry date entered is in the past.\",\"AyW5XQ\":\"The expiry date entered is invalid.\",\"Bgj3Kg\":\"The information entered is invalid.\",\"RHUVTw\":\"The CUIT entered is invalid.\",\"o/4VfA\":\"Social security number\",\"SU+d+A\":\"There was a problem processing your document. Please check the document ID number and try again.\",\"b97IqA\":\"The CUIL entered is invalid.\",\"qlOn8g\":\"Cardholder name\",\"L+s6vQ\":\"The card number entered is invalid.\",\"VfDeYg\":\"Street name\",\"EYdPQg\":\"Almost there, for extra security we need you to verify this payment.\"}");
 const cmsg = window["cmsg"] = window["cmsg"] || {};
 const strings = cmsg["strings"] = cmsg["strings"] || {};
 strings["en"] = strings["en"] ? Object.assign(strings["en"], messages) : messages;
})();