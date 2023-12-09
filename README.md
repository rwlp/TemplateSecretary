# Template Secretary App Android for Church

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Architecture](#architecture)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This code is an app with basic structure. The main goal of this code is to show my skills in MVVM architecture. 
This app don't have practical use, but can be used to start a real application. 

## Features

- Bottom Navigation
  - A bottom bar that controls the content in center screen
- TopBar
  - A top bar with Logo and simple Menu. 
- Navigation Drawer
  - A Drawer Navigation with options and actions

## Architecture

The Architecture of this project use MVVM pattern and simple modularization. 
There are 5 main packages:
- datamodels: this packages contain classes with data structures used in the views.
- di: There are the modules and interfaces used by Dragger lib to Dependency Injection on entire project. 
- repositories: The classes responsible to fetch data from database
- viewmodels: for each view in project exists a viewmodel class responsible to treat data and show this data to view classes
- views: Activities and Fragment classes are in this package. Every UI component of framework are on this classes and just in this classes. 

We use LiveData pack to dynamic refresh of the UI based on data change. 

## Getting Started

To run this project is recomended use Android Studio Hedgehog | 2023.1.1
See android manifest for more details of device operational system and other technical informations. 

Provide instructions on how to set up the project locally. Include prerequisites, installation steps, and any configuration needed.

## Contributing

Feel free to contributions on this project. 

## License 

Feel free to use this, just please give credits. 