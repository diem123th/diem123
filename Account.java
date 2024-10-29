public class Account {
        String id;
        String name;
        int balance;
        Account(String id, String name){
            this.id=id;
            this.name=name;
        }
        Account( String id, String name, int balance){
            this.id=id;
            this.name=name;
            this.balance=balance;
        }
        String getID(){
            return id;
        }
        String getName(){
            return name;
        }
        int getBalance(){
            return balance;
        }
        void credit(int amount) {
            balance += amount;
        }

        // Method to debit (subtract) an amount from the balance
        void debit(int amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Amount exceeded balance");
            }
        }
        void transferTo(Account anotherAccount, int amount) {
            if (amount <= balance) {
                balance-=amount;
                anotherAccount.credit(amount);
                System.out.println("Transfer successful!");
            } else {
                System.out.println("Insufficient funds for transfer!");
            }
        }
        public String toString(){
            return "Account[id="+id+",name="+name+",balance="+balance+"]";
        }



    }

