const invincible = 94;
let changeme = 82;

console.log(`invincible = ${invincible}, but changeme = ${changeme}`);
//looks like were printing the variables like 
//string interpolation style or something

changeme = 100;

//uncomment this to see how you cannot do it
//thats implied because its const not let
//invincible = 1000;


console.log(`After change: invincible = ${invincible}, but changeme = ${changeme}`)