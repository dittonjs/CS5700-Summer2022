class Faculty: Person() {
    override fun generateReport(): Report {
        return GradeSubmissionReport()
    }
}