process.stdin.on('data',cash=>{
    let sum = 0;
    
    sum = sum + parseInt(cash/100);
    cash = cash%100;
    
    sum = sum + parseInt(cash/50);
    cash = cash%50;
    
    sum = sum + parseInt(cash/10);
    cash = cash%10;
    
    sum = sum + parseInt(cash/5);
    cash = cash%5;
    
    sum = sum + parseInt(cash/2);
    cash = cash%2;
    
    sum = sum + parseInt(cash/1);
    
    console.log(sum);
    
    process.exit();
});