package com.mywaysai.automatedtaskremindertrackingapplication.dto;



import java.time.LocalDateTime;

public class TaskDto {
    public Long id;
    public String title;
    public String description;
    public LocalDateTime dueDate;
    public boolean completed;
    public LocalDateTime completedAt;
    public String reminderEmail;
    public Integer reminderMinutesBefore;
    public Integer visits;
}


//automated-task-reminder/
//├─ pom.xml
//├─ src/main/java/com/example/taskreminder/
//│  ├─ TaskReminderApplication.java
//│  ├─ config/
//│  │  ├─ SchedulerConfig.java
//│  │  └─ MailConfig.java
//│  ├─ controller/
//│  │  ├─ TaskController.java
//│  │  ├─ ScheduleController.java
//│  │  └─ ReportController.java
//│  ├─ dto/
//│  │  ├─ CreateTaskRequest.java
//│  │  └─ TaskDto.java
//│  ├─ entity/
//│  │  └─ Task.java
//│  ├─ repository/
//│  │  └─ TaskRepository.java
//│  ├─ service/
//│  │  ├─ TaskService.java
//│  │  ├─ SchedulerService.java
//│  │  ├─ ReportService.java
//│  │  └─ EmailService.java
//│  └─ util/
//│     └─ CsvUtil.java
//├─ src/main/resources/
//│  ├─ application.yml
//│  └─ data.sql   (optional sample data)
//└─ README.md





//{
//"name": "react-task-reminder",
//"private": true,
//"version": "0.0.0",
//"type": "module",
//"scripts": {
//"dev": "vite",
//"build": "vite build",
//"lint": "eslint .",
//"preview": "vite preview"
//},
//"dependencies": {
//"axios": "^1.13.2",
//"bootstrap": "^5.3.8",
//"react": "^18.3.1",
//"react-dom": "^18.3.1",
//"react-router-dom": "^6.30.2"
//},
//"devDependencies": {
//"@eslint/js": "^9.39.1",
//"@types/react": "^19.2.5",
//"@types/react-dom": "^19.2.3",
//"@vitejs/plugin-react": "^5.1.1",
//"babel-plugin-react-compiler": "^1.0.0",
//"eslint": "^9.39.1",
//"eslint-plugin-react-hooks": "^7.0.1",
//"eslint-plugin-react-refresh": "^0.4.24",
//"globals": "^16.5.0",
//"vite": "npm:rolldown-vite@7.2.5"
//},
//"overrides": {
//"vite": "npm:rolldown-vite@7.2.5"
//}
//}

