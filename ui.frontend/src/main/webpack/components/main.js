jQuery(
  (function ($) {
    "use strict";
    // Language Switcher
    $(".language-option").each(function () {
      var each = $(this);
      each
        .find(".lang-name")
        .html(each.find(".language-dropdown-menu a:nth-child(1)").text());
      var allOptions = $(".language-dropdown-menu").children("a");
      each.find(".language-dropdown-menu").on("click", "a", function () {
        allOptions.removeClass("selected");
        $(this).addClass("selected");
        $(this)
          .closest(".language-option")
          .find(".lang-name")
          .html($(this).text());
      });
    });

  })(jQuery)
);