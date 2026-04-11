package bankingApp;

import banking.Account;

class TestAccount extends Account {
    public static void main(String[] args) {
        TestAccount t = new TestAccount();
        t.publicMethod();
        t.protectedMethod();
    }
}