<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>


<h1><b>Money transferring service</b></h1>
<div class="container" id="sender_card_details_form">
    <h2>Your card details </h2>
    <div class="row">
        <div class="col-xs-5">
            <label for="sender_cardnum" >Card Number</label>
            <input type="text" id="sender_cardnum" class="form-control">
        </div>
    </div>
    <div class="row">
        <div class="col-xs-5 mt-2">
            <label for="sender_carddate" >Expiration date</label>
            <input type="month" id="sender_carddate" class="form-control">
        </div>
    </div>
    <div class="row">
        <div class="col-xs-3 mt-2">
            <button class="btn btn-primary"
            onclick="onSectionValidation('sender_cardnum', 'sender_carddate', 'sender_card_details_form', 'receiver_card_details_form', true)">Confirm card details</button>
        </div>
    </div>
</div>
<%--division between divs--%>
<div class="container" id="receiver_card_details_form">
<h2>Send to</h2>
    <div class="row">
        <div class="col-xs-5">
            <label for="rec_cardnum" >Card Number</label>
            <input type="text" id="rec_cardnum" class="form-control">
        </div>
    </div>
    <div class="row">
        <div class="col-xs-3 mt-2">
            <button  class="btn btn-primary"
            onclick="onSectionValidation('rec_cardnum', '', 'receiver_card_details_form', 'amount_form', false)">Confirm card details</button>
        </div>
    </div>
</div>

<%--division between divs--%>
<div class="container" id="amount_form">
    <h2>Input amount in USD</h2>
    <div class="row">
        <div class="col-xs-5">
            <label for="amount">Amount</label>
            <input type="number" id="amount" class="form-control">
        </div>
    </div>
    <div class="row">
        <div class="col-xs-3 mt-2">
            <button  class="btn btn-primary" onclick="mainExec()">Confirm card number</button>
        </div>
    </div>
</div>

<div class="container mt-2" id="result">
    <div class="row">
        <p></p>
    </div>
    <div class="row">
        <div class="col-xs-3">
            <button class="btn btn-success" onclick="sendTransfer()">Continue</button>
        </div>
        <div class="col-xs-3 offset-1">
            <button class="btn btn-danger" onclick="cancelTransfer()">Cancel</button>
        </div>
    </div>
</div>

</body>
<script language="JavaScript" src="myAJAXlib.js"></script>
<script language="JavaScript" SRC="myJS.js"></script>
</html>
