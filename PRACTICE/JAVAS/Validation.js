class Validation{
    validateEmail(email){
  const pattern =/^[a-zA-Z0-9]+@gmail\.com$/;
  const result=pattern.test(email);
  if(!result){
    return (console.log('Invalid Email'));
  }else{
  return (console.log(email));
  }
    }
    validateContact(contact){
        const pattern =/^07\d{8}$/;
        const result=pattern.test(contact);
        if(!result){
            return (console.log('Invalid Contact'));
        }else{
            return (console.log(contact));
        }
    }
    validateName(name){
        const pattern =/^[a-zA-Z]+$/;
        const result=pattern.test(name);
        if(!result){
            return(console.log('Invalid Name'));
        }else{
            return (console.log(name));
        }
    }
}
const obj=new Validation();
const em=obj.validateName('uu4uu');