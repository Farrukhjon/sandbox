const testString = "<br /> <b>Fatal</b>:  Allowed memory size of 134217728 bytes exhausted (tried to allocate 20480 bytes) in <b>/var/www/html/data_access/AdxService.php</b> on line <b>117</b><br />"

/*const matcher = /[a-z]+/gi;
const matches = testString.match(matcher);
const result = matches.join('');
console.log(result);*/

console.log(/ALLOWED MEMORY/i.test(testString));

