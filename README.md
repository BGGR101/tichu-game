# Tichu (UNDER DEVELOPMENT)

This is an early build of a Java-based multiplayer **Tichu** card game implementation, built collaboratively by a team of friends. This project recreates the classic card game *Tichu*, offering an engaging, strategy-focused experience for both casual and competitive players.

## Table of Contents
- [About the com.tichu.ui.GameWindow](#about-the-game)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Gameplay](#gameplay)
- [Contributing](#contributing)
- [License](#license)
  
---

## About the com.tichu.ui.GameWindow

*Tichu* is a popular trick-taking card game, traditionally played by four players in partnerships. This project aims to provide a seamless, online multiplayer experience with all the strategic depth of the original game.

## Features
- **Multiplayer Support**: Play with friends in real-time.
- **Accurate Tichu Rules**: Complete rule set for authentic gameplay.
- **Robust com.tichu.ui.GameWindow Mechanics**: Includes support for calls, bombs, and scoring.
- **User-friendly Interface**: Intuitive game interface to enhance player experience.
  
## Getting Started

Follow these steps to get the project up and running locally.

### Prerequisites

- **Java Development Kit (JDK) 23** or higher
- **Maven** for build and dependency management

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/BGGR101/tichu-game.git
   cd tichu-game
   ```
2. **Build the project using Maven**:
   ```bash
    mvn clean compile
    ```
3. **Run the project**:
    ```bash
    mvn exec:java "-Dexec.mainClass=com.tichu.Main"
    ```

## Gameplay
- **Setup**: Four players, paired into two teams.
- **Objective**: Be the first team to score 1,000 points.
- **Special Cards**: Includes com.tichu.model.cards.Mahjong, com.tichu.model.cards.Dog, com.tichu.model.cards.Phoenix, and com.tichu.model.cards.Dragon cards, each with unique effects.

For a complete breakdown of rules, see the [wiki](https://en.namu.wiki/w/%ED%8B%B0%EC%B8%84).

## Contributing
We welcome contributions to enhance the project! Please follow these steps:
1. **Fork the repository** and create a new branch for your feature.
2. **Make your changes** and ensure code quality.
3. **Submit a pull request** detailing the changes.

## License
Distributed under the MIT License. See [LICENSE](https://raw.githubusercontent.com/BGGR101/tichu-game/refs/heads/master/LICENSE) for more information.
