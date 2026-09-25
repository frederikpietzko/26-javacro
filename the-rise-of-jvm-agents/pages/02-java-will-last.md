---
layout: intro
class: section-intro
---

# Why Python was first

## and why Java will last

---

# The early days of AI

- AI used to be a research topic
- Researchers favor Python
- quick prototyping
- early network effects through `numpy`, `pandas` and `scikitlearn`


---

# What came after

- Researchers joined companies
- brought python with them
- `langchain`, `langraph`, etc were created


---

# The heavy lifting

- Still done in C or C++

---

# LLMs changed this

- LLMs are (mostly) too big to run locally
- Datacenters with thousands of GUPS
- Accessible through APIs
- everything is `json` & json-schemas
- working with structured data is harder in python


---

# All that is needed is Network IO

- the JVM is excels at this
- `jackson` can serialize structured responses and generate json-schemas 
- strict typing works out of the box

---

# The JVM effect

- Most enterprise-systems are written in Java
- that is where the most potential for automation lives 
- unrealistic (and annoying) to mcp servers for every legacy system and create python agents alongside
- much easier to create agents directly in your java projects
- Well known ecosystem for enterprise teams
- we have major ecosystem vendors building best-in-class agentic libraries

---

# Hard truth

- Most of AI-projects fail
- trying to automate human interaction is the wrong choice
- automate things that are boring, repetitive and time-consuming
- we all know legacy processes in these enterprise systems
