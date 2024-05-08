public enum Country {
    PL{
        @Override
        public String toString() {
            return "Polska";
        }
    },
    NL{
        @Override
        public String toString() {
            return "Nederlands";
        }
    },
    DE{
        @Override
        public String toString() {
            return "Deutschland";
        }
    };
}
