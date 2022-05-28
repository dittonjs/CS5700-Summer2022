class Student(): Person() {
    override fun generateReport(): Report {
        return AttendanceReport()
    }
}

