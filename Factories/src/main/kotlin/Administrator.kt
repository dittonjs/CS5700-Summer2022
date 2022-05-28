class Administrator: Person() {
    override fun generateReport() = ExpensesReport()
}