import { formatCurrency } from "../scripts/utils/money.js";
if(formatCurrency(2000.5)==='20.00'){
    console.log("test Passed");
}else{
    console.log("failed");
}
