window.onload = customize;
const resultDiv = document.getElementById('result');
const getterDiv = document.getElementById('receiver_card_details_form');
const amountDiv = document.getElementById('amount_form');


function customize(){
	getterDiv.style.display = 'none';
	amountDiv.style.display = 'none';
	resultDiv.style.display = 'none';
}

function mainExec()
{
	let params = 'type=price&value='+document.getElementById('amount').value;
	doAjax('mainExec',params, convertPrice_back, 'post',0);
}

function convertPrice_back(result)
{
	const inWordsAndUAH = result.split(';');
	resultDiv.firstElementChild.firstElementChild.textContent = `You are sending ${inWordsAndUAH[0]} (${inWordsAndUAH[1]} UAH) 
	from card ${localStorage.getItem('senderCard')} to ${localStorage.getItem('receiverCard')}.
	Continue?`;
	resultDiv.style.display = 'block';
}

function onValidateCardNumber(inputFieldId) {
	const cardNumber =  document.getElementById(inputFieldId).value;
	// call to servlet, which calls SOAP service

	return true;
}

function onValidateCardDate(inputFieldId) {
	const date = new Date(document.getElementById(inputFieldId).value);
	return true;
}


function onSectionValidation(numberField, dateField, divToDisappear, divToAppear, validateCardDate) {
	const numberValidation = onValidateCardNumber(numberField);
	let dateValidation = true;
	if (validateCardDate) {
		dateValidation = onValidateCardDate(dateField);
		localStorage.setItem('senderCard', document.getElementById(numberField).value);
		document.getElementById(dateField).value = '';
	} else {
		localStorage.setItem('receiverCard', document.getElementById(numberField).value);
	}
	document.getElementById(numberField).value = '';

	if (divToAppear !== '' && divToDisappear !== '') {
		document.getElementById(divToDisappear).style.display = 'none';
		document.getElementById(divToAppear).style.display = 'block';
	}
	return numberValidation && dateValidation;
}


function sendTransfer() {
	setTimeout(() => {
		document.getElementById('sender_card_details_form').style.display = 'block';
		resultDiv.style.display = 'none';
		amountDiv.style.display = 'none';
		document.getElementById('amount').value = '';

	}, 450);  //emulation sending request to server
}

function cancelTransfer() {
	document.getElementById('sender_card_details_form').style.display = 'block';
	resultDiv.style.display = 'none';
	amountDiv.style.display = 'none';
	document.getElementById('amount').value = '';
}

