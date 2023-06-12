package CaixaEletronico;

 class Account {
        private String email;
        private String password;
        private double balance;

        public Account(String email, String password) {
            this.email = email;
            this.password = password;
            this.balance = 0.0;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public boolean withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        }
    }
