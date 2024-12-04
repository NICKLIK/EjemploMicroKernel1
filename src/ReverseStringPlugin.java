class ReverseStringPlugin implements Plugin {
    public String execute(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}