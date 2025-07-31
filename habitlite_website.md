# HabitLite - Lightweight Habit Tracking Website

## Overview
HabitLite is a simple, clean, and effective habit tracking web application designed to help users build and maintain positive habits. The application focuses on simplicity and ease of use, making habit tracking accessible to everyone.

## Features

### Core Features
- **Habit Creation**: Create custom habits with personalized names and descriptions
- **Daily Tracking**: Mark habits as completed with a simple click interface
- **Progress Visualization**: View habit completion streaks and statistics
- **Habit Categories**: Organize habits into categories (Health, Productivity, Learning, etc.)
- **Streak Counter**: Track consecutive days of habit completion
- **Calendar View**: Visual calendar showing habit completion history

### Advanced Features
- **Habit Analytics**: Weekly and monthly progress reports
- **Goal Setting**: Set specific targets for habit frequency
- **Reminder System**: Optional email/browser notifications
- **Data Export**: Export habit data in CSV format
- **Habit Templates**: Pre-built habit templates for common goals
- **Dark/Light Mode**: Toggle between themes for better user experience

## Technology Stack

### Frontend
- **HTML5**: Semantic markup for accessibility
- **CSS3**: Modern styling with Flexbox/Grid layouts
- **JavaScript (ES6+)**: Interactive functionality and DOM manipulation
- **Local Storage**: Client-side data persistence

### Optional Enhancements
- **Progressive Web App (PWA)**: Offline functionality and mobile app-like experience
- **Chart.js**: Data visualization for progress charts
- **Service Worker**: Caching and offline support

## Project Structure
```
habitlite-website/
├── index.html              # Main application page
├── css/
│   ├── styles.css          # Main stylesheet
│   ├── themes.css          # Theme variations
│   └── responsive.css      # Mobile responsiveness
├── js/
│   ├── app.js              # Main application logic
│   ├── habit-manager.js    # Habit CRUD operations
│   ├── storage.js          # Local storage management
│   └── utils.js            # Utility functions
├── assets/
│   ├── icons/              # App icons and favicons
│   └── images/             # UI images and graphics
├── manifest.json           # PWA manifest file
└── README.md              # Project documentation
```

## Setup Instructions

### Prerequisites
- Modern web browser (Chrome, Firefox, Safari, Edge)
- Text editor or IDE for development
- Basic knowledge of HTML, CSS, and JavaScript

### Installation
1. Clone or download the project files
2. Open `index.html` in your web browser
3. Start using the application immediately (no server setup required)

### Development Setup
```bash
# If using a local development server
npx serve .
# OR
python -m http.server 8000
# OR
php -S localhost:8000
```

## Usage Guide

### Getting Started
1. **Create Your First Habit**
   - Click "Add New Habit" button
   - Enter habit name (e.g., "Drink 8 glasses of water")
   - Select a category
   - Set frequency (daily, weekly, etc.)
   - Save the habit

2. **Track Daily Progress**
   - View your habits on the main dashboard
   - Click the checkmark to mark a habit as complete
   - Watch your streak counter increase

3. **View Progress**
   - Check the calendar view to see completion history
   - Review weekly/monthly statistics
   - Analyze patterns in your habit formation

### Best Practices
- Start with 1-3 habits to avoid overwhelm
- Choose specific, measurable habits
- Set realistic goals and frequencies
- Review progress regularly
- Celebrate streaks and milestones

## API Reference (Future Enhancement)

### Local Storage Schema
```javascript
// Habits are stored as an array of objects
const habit = {
  id: 'unique-id',
  name: 'Habit Name',
  category: 'Health',
  frequency: 'daily',
  createdDate: '2025-01-01',
  completions: ['2025-01-01', '2025-01-02'], // Array of completion dates
  streak: 2,
  longestStreak: 5
};
```

### Key Functions
- `createHabit(habitData)`: Create a new habit
- `markComplete(habitId, date)`: Mark habit as complete for a date
- `getHabitStats(habitId)`: Get statistics for a specific habit
- `exportData()`: Export all habit data

## Customization

### Themes
The application supports multiple themes:
- Light mode (default)
- Dark mode
- High contrast mode
- Custom color schemes

### Categories
Default categories include:
- Health & Fitness
- Productivity
- Learning & Growth
- Social & Relationships
- Mindfulness
- Hobbies
- Custom categories

## Browser Support
- Chrome 60+
- Firefox 55+
- Safari 12+
- Edge 79+
- Mobile browsers (iOS Safari, Chrome Mobile)

## Future Enhancements
- [ ] User authentication and cloud sync
- [ ] Social features and habit sharing
- [ ] Advanced analytics and insights
- [ ] Integration with fitness trackers
- [ ] Team challenges and competitions
- [ ] Habit coaching and AI suggestions
- [ ] Mobile app versions (iOS/Android)

## Contributing
1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/new-feature`)
5. Create a Pull Request

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Contact
For questions, suggestions, or support, please contact:
- Email: support@habitlite.com
- GitHub Issues: [Project Issues](https://github.com/username/habitlite-website/issues)

## Acknowledgments
- Inspired by popular habit tracking apps like Habitica and Streaks
- Icons provided by [source]
- Design patterns from modern web UI libraries

---

*HabitLite - Making habit formation simple and effective*