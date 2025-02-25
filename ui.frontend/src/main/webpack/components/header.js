$(document).ready(function() {
  var phoneNumber = "${model.phoneNumber}";
  if (phoneNumber) {
    $("#phoneLink").attr("href", "tel:" + phoneNumber);
  }
  console.log("phone number fixed");
});